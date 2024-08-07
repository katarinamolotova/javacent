# javacent library

Java SDK to communicate with Centrifugo v5 HTTP API. Java >= 8 supported.

To add to your maven project:
```
<dependency>
  <groupId>org.centrifugo</groupId>
  <artifactId>javacent</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```

## Usage

First of all, see the description of Centrifugo [server API](https://centrifugal.dev/docs/server/server_api) in the documentation. This library also supports API extensions provided by Centrifugo PRO.

The library contains `CentrifugoService` to work with Centrifugo HTTP server API.

## Configuration

To configure the library, you need to create a file in the resources folder called `centrifugo.properties`.

Possible properties:
* `centrifugo.api.key` - Centrifugo HTTP API key for auth (default is empty string)
* `centrifugo.api.port` - Centrifugo port (defult is `8000`)
* `centrifugo.api.url` - Centrifugo URL address without port (defult is `http://localhost`)
* `centrifugo.api.insecure` - Centrifugo HTTP API is insecure. If it is true, `centrifugo.api.key` will be an empty string (default is `false`)

Properties example:

```
centrifugo.api.key=centrifugo
centrifugo.api.url=http://localhost
centrifugo.api.port=8000
centrifugo.api.insecure=FALSE
```

## Usage example

```
import org.centrifugo.services.CentrifugoService;

public class DemoApplication {

    public static void main(String[] args) {
        CentrifugoService centrifugoService = new CentrifugoService();
        centrifugoService.publish("Hello World!", "channel");
    }

}
```
