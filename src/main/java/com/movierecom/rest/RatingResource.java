package com.movierecom.rest;

import com.movierecom.service.RatingService;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rating")
public class RatingResource {

    @Inject
    RatingService ratingService;

    @GET
    @Path("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam String name) {

        return ratingService.greeting(name);
    }




}