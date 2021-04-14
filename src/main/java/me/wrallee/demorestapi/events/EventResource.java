package me.wrallee.demorestapi.events;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

public class EventResource extends RepresentationModel<EventResource> {

    @JsonUnwrapped // BeanSerializer 의한 wrap 방지
    private final Event event;

    public EventResource(Event event) {
        this.event = event;
        add(WebMvcLinkBuilder.linkTo(EventController.class).slash(event.getId()).withSelfRel());
    }

    public Event getEvent() {
        return event;
    }
}
