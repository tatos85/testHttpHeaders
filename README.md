# testHttpHeaders
Prueba de desarrollo por Jaime Eduardo Rivera Contreras

## Tecnologias usadas

* Aplicación Spring Boot - Java 11
* Maven para las diferentes dependencias
* IDE Eclipse 2020-12

## Consideraciones para ejecutar en ambientes locales

* Clonar de github 
* Para ejecutar el proyecto, lo pueden hacer desde eclipse: importan el proyecto -> maven install -> Run as SpringBootApp
* O desde consola con el comando "mvn install" que generará un archivo "micros-0.0.1-SNAPSHOT.jar" el cual se debe ejecutar bajo este comando "java -jar micros-0.0.1-SNAPSHOT.jar"
* ver imagen Ejecucion por consola del proyecto.png para ver ejemplo de ejecucion en consola.
* Debe tener instalado java 11 en la maquina y el path del equipo apuntando a esa version

## Endpoints	

### PRIMER PUNTO: Endpoint: http://localhost:8080/punto1
**Descripción:** Endpoint para probar con un metodo POST la generacion del map de los http headers, se puede agregar cuantos headers se quiera probar
**Tipo:** POST
**Headers haciendo peticion desde postman:** [{"key":"Content-Type","value":"application/json; application/javascript","description":""}]
**Body:**
```javascript
{
	"test":"test"
}

```
**Respuesta ejemplo haciendo peticion desde postman:** Http 200
```javascript
{
    "sec-fetch-mode": [
        "cors"
    ],
    "content-length": [
        "18"
    ],
    "sec-fetch-site": [
        "none"
    ],
    "accept-language": [
        "es-CO,es;q=0.9,fr-CA;q=0.8,fr;q=0.7,es-419;q=0.6,en;q=0.5"
    ],
    "postman-token": [
        "ffd6f0ce-498f-887a-4669-188ccc9cdea6"
    ],
    "origin": [
        "chrome-extension://fhbjgbiflinjbdggehcddcbncdddomop"
    ],
    "accept": [
        "*/*"
    ],
    "sec-ch-ua": [
        "\"Chromium\";v=\"88\", \"Google Chrome\";v=\"88\", \";Not A Brand\";v=\"99\""
    ],
    "sec-ch-ua-mobile": [
        "?0"
    ],
    "host": [
        "localhost:8080"
    ],
    "connection": [
        "keep-alive"
    ],
    "content-type": [
        "application/json; application/javascript"
    ],
    "cache-control": [
        "no-cache"
    ],
    "accept-encoding": [
        "gzip, deflate, br"
    ],
    "user-agent": [
        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.150 Safari/537.36"
    ],
    "sec-fetch-dest": [
        "empty"
    ]
}
```



### SEGUNDO PUNTO: Endpoint http://localhost:8080/punto2
**Descripción:** Endpoint para probar con un metodo POST la generacion del map de los http headers filtrando por la lista de string pasada en el body, se puede agregar cuantos headers se quiera probar
**Tipo:** POST
**Headers haciendo peticion desde postman:** [{"key":"Content-Type","value":"application/json; application/javascript","description":""}]
**Body:**
```javascript
{
	"test":"test",
	"testList":["content-type", "accept", "cache-control"]
}

```
**Respuesta ejemplo haciendo peticion desde postman:** Http 200
```javascript
{
    "content-type": [
        "application/json"
    ],
    "cache-control": [
        "no-cache"
    ],
    "accept": [
        "*/*"
    ]
}
```


