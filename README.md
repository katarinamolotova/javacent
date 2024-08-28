# javacent library

Java SDK to communicate with Centrifugo v5 HTTP API. Java >= 8 supported.

To add to your maven project:
```
<dependency>
    <groupId>org.opensolutionlab.httpclients</groupId>
    <artifactId>javacent</artifactId>
    <version>1.0.1</version>
</dependency>
```

## Usage

First of all, see the description of Centrifugo [server API](https://centrifugal.dev/docs/server/server_api) in the documentation. This library also supports API extensions provided by Centrifugo PRO.

The library contains `CentrifugoClient` to work with Centrifugo HTTP server API.

## Configuration

To configure the library, you need to create a file in the resources folder called `centrifugo.properties`.

Possible properties:
* `centrifugo.api.key` - Centrifugo HTTP API key for auth (default is empty string)
* `centrifugo.api.port` - Centrifugo port (defult is `8000`)
* `centrifugo.api.url` - Centrifugo URL address without port (defult is `http://localhost`)
* `centrifugo.api.insecure` - Centrifugo HTTP API is insecure. If it is true, `centrifugo.api.key` will be an empty string (default is `false`)
* `centrifugo.api.handler.prefix` - Centrifugo HTTP API URL prefix (default is `/api`)


Properties example:

```
centrifugo.api.key=centrifugo
centrifugo.api.url=http://localhost
centrifugo.api.port=8000
centrifugo.api.insecure=FALSE
centrifugo.api.handler.prefix=/api
```

## Usage example

```java
import org.opensolutionlab.httpclients.clients.CentrifugoClient;

public class DemoApplication {

    public static void main(String[] args) {
        CentrifugoClient client = new CentrifugoClient();
        client.publish("Hello World!", "channel");
    }

}
```

## Handling errors

This library raises exceptions if sth goes wrong. All exceptions are subclasses of CentrifugoException.

* `CentrifugoException` - base class for all exceptions
* `CentrifugoNetworkException` - raised in case of network related errors (connection refused)
* `CentrifugoTransportException` - raised in case of transport related errors (HTTP status code is not 2xx)
* `CentrifugoTimeoutException` - raised in case of timeout
* `CentrifugoUnauthorizedException` - raised in case of unauthorized access (signal of invalid API key)
* `CentrifugoDecodeException` - raised in case of server response deserialize error
* `CentrifugoApiResponseException` - raised in case of API response error (i.e. error returned by Centrifugo itself, you can inspect code and message returned by Centrifugo in this case)

Note, that `BroadcastRequest` and `BatchRequest` are quite special – since they contain multiple commands in one request, 
handling `CentrifugoApiResponseException` is still required, but not enough – you also need to manually iterate over the results to check for individual errors. 
For example, one publish command can fail while another one can succeed. For example:

```java
import org.opensolutionlab.httpclients.clients.CentrifugoClient;

public class DemoApplication {

    public static void main(String[] args) {
        CentrifugoClient client = new CentrifugoClient();
        
        client.broadcast(Arrays.asList("1", "2"), "Hello!");
        /*
         *  BroadcastResult(
         *      responses = {
         *          PublishResponse(error = null, result = PublishResult(offset = 7, epoch = "rqKx")),
         *          PublishResponse(error = null, result = PublishResult(offset = 7, epoch = "nUrf"))
         *      }
         *  )
         */

        client.broadcast(Arrays.asList("invalid:1", "2"), "Hello!");
        /*
         *  BroadcastResult(
         *      responses = {
         *          PublishResponse(error = Error(code = 102, message = "unknown channel"), result = null),
         *          PublishResponse(error = null, result = PublishResult(offset = 8, epoch = "nUrf"))
         *      }
         *  )
         */
    }
}
```

I.e. `javacent` library does not raise exceptions for individual errors in BroadcastRequest or BatchRequest, 
only for top-level response error, for example, sending empty list of channels in broadcast:

```
client.broadcast(Arrays.emptyList(), "");

org.opensolutionlab.httpclients.exceptions.CentrifugoApiResponseException: bad request
    ...
```

So this all adds some complexity, but that's the trade-off for the performance and efficiency of these two methods. 
You can always write some convenient wrappers around javacent library to handle errors in a way that suits your application.

## License

This repository is released under version 2.0 of the
[Apache License](https://www.apache.org/licenses/LICENSE-2.0).
