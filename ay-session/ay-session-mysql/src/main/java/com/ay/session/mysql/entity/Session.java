package com.ay.session.mysql.entity;

import java.io.Serializable;
import java.util.Date;

public class Session implements Serializable {
    private Long id;

    private String sessionId;

    private String username;

    private Date lastRequestTime;

    private Byte timeout;

    private static final long serialVersionUID = 1L;

    public Session(Long id, String sessionId, String username, Date lastRequestTime, Byte timeout) {
        this.id = id;
        this.sessionId = sessionId;
        this.username = username;
        this.lastRequestTime = lastRequestTime;
        this.timeout = timeout;
    }

    public Session() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getLastRequestTime() {
        return lastRequestTime;
    }

    public void setLastRequestTime(Date lastRequestTime) {
        this.lastRequestTime = lastRequestTime;
    }

    public Byte getTimeout() {
        return timeout;
    }

    public void setTimeout(Byte timeout) {
        this.timeout = timeout;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Session other = (Session) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSessionId() == null ? other.getSessionId() == null : this.getSessionId().equals(other.getSessionId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getLastRequestTime() == null ? other.getLastRequestTime() == null : this.getLastRequestTime().equals(other.getLastRequestTime()))
            && (this.getTimeout() == null ? other.getTimeout() == null : this.getTimeout().equals(other.getTimeout()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getLastRequestTime() == null) ? 0 : getLastRequestTime().hashCode());
        result = prime * result + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        return result;
    }
}