package academy.devdojo.springboot2.mapper;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.requests.AnimePostRequestBody;
import academy.devdojo.springboot2.requests.AnimePutRequestBoby;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-14T22:56:37-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.10 (Amazon.com Inc.)"
)
@Component
public class AnimeMapperImpl extends AnimeMapper {

    @Override
    public Anime toAnime(AnimePostRequestBody animePostRequestBody) {
        if ( animePostRequestBody == null ) {
            return null;
        }

        Anime anime = new Anime();

        anime.setName( animePostRequestBody.getName() );

        return anime;
    }

    @Override
    public Anime toAnime(AnimePutRequestBoby animePutRequestBoby) {
        if ( animePutRequestBoby == null ) {
            return null;
        }

        Anime anime = new Anime();

        anime.setId( animePutRequestBoby.getId() );
        anime.setName( animePutRequestBoby.getName() );

        return anime;
    }
}
