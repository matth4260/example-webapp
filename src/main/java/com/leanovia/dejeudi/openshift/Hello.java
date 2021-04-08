package com.leanovia.dejeudi.openshift;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.net.InetAddress;


@Path("/")
public class Hello {

@GET
@Produces("text/plain")
public Response index() throws Exception {
    String host = InetAddress.getLocalHost().getHostName();
    return Response.ok(" Bonjour Leanovia de la part de ...\n "  + "Host:\t"+ host).build();
  }
}
