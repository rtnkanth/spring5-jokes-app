package rtnk.springframework.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Configuration ----                                                    ------------------   Changed to XML Config at chuck-config.xml
public class ChuckConfiguration {

   // @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
