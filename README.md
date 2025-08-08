# Anotações


### Paginação e ordenação

Usando a interface Pageble é possível fazer a ordenação e paginação

`http://localhost:8080/doctors?size=r&page=2`
```java
@GetMapping
public Page<DoctorOutDTO> getAllDoctors(Pageable pageble){
    return repository.findAll(pageble).map(DoctorOutDTO::new);
}
```

É possível também mudar os atributos de paginação default que vem da própria interface como size, page, etc. Usando a anotação @PagebleDefault

```java
@GetMapping
public Page<DoctorOutDTO> getAllDoctors(@PageableDefault(size=5) Pageable pageble){
    return repository.findAll(pageble).map(DoctorOutDTO::new);
}
```

É possível mudar a linguagem dos parametros também, de inglês para portugues, no application.properties ou application.yml fazer o seguinte:

`http://localhost:8080/doctors?tamanho=5&pagina=1&ordem=email,desc`
```
spring.data.web.pageable.page-parameter=pagina
spring.data.web.pageable.size-parameter=tamanho
spring.data.web.sort.sort-parameter=ordem
```


### Mostrar logs sql

É possível habilitar os logs que são feitos pela paginação e afins nos logs que o spring disponibiliza no Run, basta ir no application.properties ou application.yml e configurar para que o JPA mostre os logs.


- application.yml
```
  jpa:
    show-sql: true
    properties:
      hibernate:
        format_sql: true
```

- application.properties
```
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```