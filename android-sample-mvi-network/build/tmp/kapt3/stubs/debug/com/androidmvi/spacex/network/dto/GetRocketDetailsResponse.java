package com.androidmvi.spacex.network.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/androidmvi/spacex/network/dto/GetRocketDetailsResponse;", "", "name", "", "success", "", "date_utc", "Ljava/util/Date;", "links", "Lcom/androidmvi/spacex/network/dto/Links;", "(Ljava/lang/String;ZLjava/util/Date;Lcom/androidmvi/spacex/network/dto/Links;)V", "getDate_utc", "()Ljava/util/Date;", "getLinks", "()Lcom/androidmvi/spacex/network/dto/Links;", "getName", "()Ljava/lang/String;", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "android-sample-mvi-network_debug"})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public final class GetRocketDetailsResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final boolean success = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date date_utc = null;
    @org.jetbrains.annotations.NotNull()
    private final com.androidmvi.spacex.network.dto.Links links = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final boolean getSuccess() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDate_utc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.androidmvi.spacex.network.dto.Links getLinks() {
        return null;
    }
    
    public GetRocketDetailsResponse(@org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
    java.lang.String name, @com.fasterxml.jackson.annotation.JsonProperty(value = "success")
    boolean success, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "date_utc")
    java.util.Date date_utc, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "links")
    com.androidmvi.spacex.network.dto.Links links) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.androidmvi.spacex.network.dto.Links component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.androidmvi.spacex.network.dto.GetRocketDetailsResponse copy(@org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
    java.lang.String name, @com.fasterxml.jackson.annotation.JsonProperty(value = "success")
    boolean success, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "date_utc")
    java.util.Date date_utc, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "links")
    com.androidmvi.spacex.network.dto.Links links) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}