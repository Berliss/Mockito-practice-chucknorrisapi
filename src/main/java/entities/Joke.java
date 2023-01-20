package entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Joke {
    private List<String> categories;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("icon_url")
    private String iconURL;
    private String id;
    @JsonProperty("updated_at")
    private String updatedAt;
    private String url;
    private String value;
}
