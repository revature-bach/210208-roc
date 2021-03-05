# Overview of Web Services

Web services basically refer to a software system designed to support interoperable machine-to-machine interaction over a network. Web services must be designed to adhere to particular standards of communication (such as HTTP). Web services are "exposed" via some sort of consumable API.

Web services usually format information they send/receive via XML or JSON.

XML (Xtensible Markup Language): this was the old way of sending and receiving data, which is not really used as much anymore.

JSON (JavaScript Object Notation): it is a language agnostic format for sending and recieving data. Used commonly in all sorts of programming languages such as Python, Java, JavaScript, etc. in order to have some sort of medium of data.

## Two Flavors of Web Services
- REST (Representational State Transfer)
- SOAP (Simple Object Access Protocol)

## REST
Stands for **representational state transfer**. 

REST is an architectural style that outlines the communicastion between a client and server over the web. For a web service to be RESTful it must adhere to a set of guidelines or constraints.

A RESTful server should also not retain information about the state of the client.

In a RESTful system, the server creates an object or resource and returns the state of that obtain when requested by the client.

## SOAP
Stands for **simple object access protocol**. It is a protocol that allows for interoperability between two machines across a network. 

SOAP services respond to requests in the form of XML documents, also known as messages in this case. Though a SOAP service can receive any kind of request, if it receives an HTTP request, it must be in the form of a POST request.