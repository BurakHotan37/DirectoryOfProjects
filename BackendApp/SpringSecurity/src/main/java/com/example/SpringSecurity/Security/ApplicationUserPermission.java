package com.example.SpringSecurity.Security;

public enum ApplicationUserPermission
{
    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write"),
    COURSE_READ("course:read"),
    COURSE_WRITE("course:write");

    private final String permission;

    ApplicationUserPermission(String premission)
    {
        this.permission = premission;
    }
    public String getPermission()
    {
        return permission;
    }
}
