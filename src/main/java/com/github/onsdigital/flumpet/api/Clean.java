package com.github.onsdigital.flumpet.api;

import com.github.davidcarboni.restolino.framework.Api;
import com.github.onsdigital.flumpet.helpers.Json;
import com.github.onsdigital.flumpet.json.FtpInfo;
import com.github.onsdigital.flumpet.storage.FtpPublisher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import java.io.IOException;

/**
 * List files in ftp.
 */
@Api
public class Clean {

    private FtpPublisher ftp = new FtpPublisher();

    @GET
    public FtpInfo deleteAll(HttpServletRequest request, HttpServletResponse response) throws IOException {

        FtpInfo ftpInfo = ftp.deleteAll();
        System.out.println("ftp >>>>>>>> deleteAll: " + Json.format(ftpInfo));

        return ftpInfo;
    }
}
