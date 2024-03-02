package project.moviecatalogservice;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
public class movieCatalogResource {

   @RequestMapping("/test")
    public List<CatalogItem> getCatalog(String userId) {
        return Collections.singletonList(
                new CatalogItem("dark", "work", 5)
        );
    }













}
