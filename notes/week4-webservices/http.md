# HTTP
Hypertext Transfer Protocol (HTTP) is a client-server protocol. This means that the client must initiate the communication. In particular, the communication is initiated in the form of an HTTP request.

The HTTP protocol is part of the "application layer" and therefore requires some underlying protocol to transmit data. In this case, it is TCP (transmission control protocol).

## HTTP requests
Requests are composed of:
- Verb
    - indicates the executing HTTP method
- URI
    - Specifies the endpoint where the resource is located
- HTTP Version
- Request Header
    - contains meta-data of the request, such as the browser type, etc.
- Request Body
    - Contains message content/data to be sent to the server

## HTTP responses
Responses are composed of:
- Response Code
    - Tells you about the situation of the response
    - 1xx (informational)
    - 2xx (good)
    - 3xx (redirects)
    - 4xx (client side error)
    - 5xx (server side error)
- HTTP Version
- Response Header
- Response Body
    - Contains data for the response

## HTTP Verbs
HTTP request verbs or methods indicate the action that a client is hoping to perform. You can basically think of these verbs as a standard as to how you are utilizing your request.

- GET
    - Is intended to be used to retrieve data
    - Should not really have a request body
    - "safe"
    - "idempotent"
    - Should also be cacheable (meaning if people are constantly getting the same resource, it would be good to have a cache for it so that it speeds things up)
    - Allowed to have the form of HTML
- HEAD
    - Essentially the same as GET, but the server response should not include a body
    - Not used often
- POST
    - Is intended to be used to send data to the server
    - Often used to create or update data
    - Is NOT "safe" or "idempotent"
    - Request will typically have a body (since you're sending data)
    - Response should also have a body (typically containing the resource that was just created)
- PUT
    - Is intended to be used to update an existing resource by replacing the current representation of data with the one included in the PUT request
    - is "idempotent", but not "safe"
    - Request will have a body
    - Response may/or may not have a body containing the updated resource
- DELETE
    - Intended to be used to DELETE a resource
    - might have a request/response body
    - is "idempotent", but not "safe"
- PATCH
    - similar to update
    - changes partial aspects of a resource
- CONNECT
- OPTIONS
- TRACE

The main HTTP verbs/methods you might use would be
1. GET
2. POST
3. PUT
4. PATCH
5. DELETE

