package com.hexagonal.telcel.infrastructure.Adapters;

import com.hexagonal.telcel.domain.Ports.Outputs.ExternalServicePort;
import org.springframework.web.client.RestTemplate;

public class ExternalServiceAdapter implements ExternalServicePort {


    private final RestTemplate restTemplate;

    public ExternalServiceAdapter(){
        restTemplate = new RestTemplate();
    }

    /* @Override
    * public AditionalModelInfo getAdditionalModelInfo(Long taskId) {
    *   String ApiUrl = "https://jsonplacegolder.typicode.com/todos" + taskId;
    *   ResponseEntity<JsonPlaceHolderTodo> response = restTemplate.getForEntity(ApiUrl,JsonPlaceHolderTodo.class);
    *   JsonPlaceHolderTodo todo = response.getBody();
    *   if(todo == null){
    *       return null;
    *   }
    *
    *   ApiUrl = "https://jsonplacegolder.typicode.com/users" + todo.getUserId();
    *   ResponseEntity<JsonPlaceHolderUser> userResponse = restTemplate.getForEntity(ApiUrl, JsonPlaceHolderUser.class);
    *   JsonPlaceHolderUser user = userResponse.getBody();
    *   if(user == null){
     *       return null;
     *   }
     *
     *  return new AdditionalModelInfo(user.getId(), user.getName(), user.getEmail());
    * }
    * */

    //Implementar metodo de la interfaz de servicio externo
    // Crear peticiones dentro del metodo

    private static class JsonPlaceHolderTodo{
        private Long id;
        private Long userId;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getUserId() {
            return userId;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }
    }

    private static class JsonPlaceHolderUser{

        private Long id;
        //atributos de la información adicional


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }

}
