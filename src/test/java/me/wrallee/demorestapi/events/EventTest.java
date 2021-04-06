package me.wrallee.demorestapi.events;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

public class EventTest {

    @Test
    public void builder() throws Exception {
        // given
        // when
        Event event = Event.builder()
                .name("Lecture - Spring REST API Practice")
                .description("REST API development with spring")
                .build();

        // then
        assertThat(event).isNotNull();
    }

    @Test
    public void javaBean() throws Exception {
        // given
        String name = "Event";
        String spring = "Spring";

        // when
        Event event = new Event();
        event.setName(name);
        event.setDescription(spring);

        // then
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(spring);
    }



}