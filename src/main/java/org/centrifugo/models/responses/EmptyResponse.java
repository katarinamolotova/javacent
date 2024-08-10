package org.centrifugo.models.responses;

import org.centrifugo.models.responses.results.EmptyResult;

/**
 * Empty response. <br>
 * It is used in cases of queries without responses to maintain abstraction.
 */
public class EmptyResponse extends StandardResponse<EmptyResult> {
}
