package com.example.SpringSecurity.Security;

import com.google.common.collect.Sets;

import java.util.Set;

public enum ApplicationUserRoles
{
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(  ApplicationUserPermission.COURSE_READ,
                            ApplicationUserPermission.COURSE_WRITE,
                            ApplicationUserPermission.STUDENT_READ,
                            ApplicationUserPermission.STUDENT_WRITE));

    private final Set<ApplicationUserPermission> permisson;

    ApplicationUserRoles(Set<ApplicationUserPermission> permisson)
    {
        this.permisson = permisson;
    }

}
