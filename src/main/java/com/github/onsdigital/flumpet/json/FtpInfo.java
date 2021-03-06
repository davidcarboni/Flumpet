package com.github.onsdigital.flumpet.json;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

/**
 * Simple object to contain Survey data.
 */
@Data
@Builder
public class FtpInfo {

    private String command;

    @Singular("filename")
    private List<String> filenames;
}
