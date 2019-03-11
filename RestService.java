@javax.ws.rs.Path("/tada")
public class RestService {
    @GET
    public String getSomething() {
        return "tada";
    }
}
