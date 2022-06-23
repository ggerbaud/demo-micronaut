package fr.mabreizh.micronaut;

import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import reactor.core.publisher.Mono;

@Controller("/")
public class DocumentedController {
    
    @Get
    Mono<Page<SomeDTO>> getSomeDTOs(Pageable pageable) {
        return Mono.empty();
    }
}
