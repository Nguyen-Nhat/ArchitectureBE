package org.archi.core.errors;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ErrorResponse {
    private String error; // short description
    private String details; // details description
}
