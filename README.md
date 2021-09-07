# Projeto: Construindo um projeto com arquitetura baseada em microserviços usando Spring Cloud

Neste projeto foi possíver visualizar o básico sobre a criação, configuração e integração de microserviços, simulando uma API de catálogo de produtos e carrinho de compras. Ao mesmo tempo também  foi apresentado como esses microserviços se conectam, através de outros microserviços:

- **Config Server**: Serviço que centraliza as configurações em comum entre os demais microserviços
- **Service Discovery**: Serviço que atua como um catálogo de microserviços e como um load balancer entre as requisições;
- **Gateway**: Serviço que serve como uma interface para redirecionar as chamadas dos clientes(frontend) para o Service Discovery.

