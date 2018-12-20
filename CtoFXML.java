package org.chiaboy.webapp;

import javax.ws.rs.*;
import java.text.DecimalFormat;

@Path("/temp/xml/c=>f")
public class CtoFXML {
    @GET
    @Produces("application/xml")
    public String convertCtoFfromInput(@QueryParam("input") double input) {
        DecimalFormat df = new DecimalFormat("####0.00");
        double farenheit = ((input * 9) / 5) + 32;
        String f = df.format(farenheit);
        String c = df.format(input);
        StringBuilder sb = new StringBuilder();
        sb.append("<calc><celsius>");
        sb.append(c);
        sb.append("</celsius>");
        sb.append("<fahrenheits>");
        sb.append(f);
        sb.append("</fahrenheits>");
        sb.append("</calc>");
        return sb.toString();
    }
}
