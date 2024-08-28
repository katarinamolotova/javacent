/*
 * Copyright 2024 Molotova Katerina, Kukhtachev Mikhail.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opensolutionlab.httpclients.handlers;

import org.apache.hc.client5.http.ClientProtocolException;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.opensolutionlab.httpclients.exceptions.CentrifugoTimeoutException;
import org.opensolutionlab.httpclients.exceptions.CentrifugoTransportException;
import org.opensolutionlab.httpclients.exceptions.CentrifugoUnauthorizedException;

import java.io.IOException;

public class CentrifugoHttpClientResponseHandler implements HttpClientResponseHandler<String> {

    public CentrifugoHttpClientResponseHandler() {
    }

    @Override
    public String handleResponse(final ClassicHttpResponse response) throws IOException {
        final HttpEntity entity = response.getEntity();

        if (response.getCode() == HttpStatus.SC_UNAUTHORIZED) {
            EntityUtils.consume(entity);
            throw new CentrifugoUnauthorizedException(response.getCode(), response.getReasonPhrase());

        } else if (response.getCode() == HttpStatus.SC_REQUEST_TIMEOUT) {
            EntityUtils.consume(entity);
            throw new CentrifugoTimeoutException(response.getCode(), response.getReasonPhrase());

        } else if (response.getCode() != HttpStatus.SC_OK) {
            EntityUtils.consume(entity);
            throw new CentrifugoTransportException(response.getCode(), response.getReasonPhrase());
        } else {
            return entity == null ? null : this.handleEntity(entity);
        }
    }

    public String handleEntity(final HttpEntity entity) throws IOException {
        try {
            return EntityUtils.toString(entity);
        } catch (ParseException e) {
            throw new ClientProtocolException(e);
        }
    }
}
