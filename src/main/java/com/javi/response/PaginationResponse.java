package com.javi.response;

public record PaginationResponse(int pageNumber, int pageSize, long total){}
