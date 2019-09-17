This Spring Boot application is a quick demo of how to map a JSON file to a Java POJO using Jackson. The Jackson
ObjectMapper is injected into the app using the @Bean annotation. The Address and Student entities are mapped to the
data in the sample json files. The @JsonIgnore annotation keeps JSON fields that aren't defined in the POJO from
causing exceptions to be thrown.
