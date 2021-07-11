package com.example.SpringSecurity.Security;

//import com.google.common.collect.Sets;
import java.util.Set;

public enum ApplicationUserRoles
{
    STUDENT,//(Sets.newHashSet()),
    ADMIN;//(Sets.newHashSet(COURSE_READ));

    private final Set<ApplicationUserPermission> permisson;

    ApplicationUserRoles(Set<ApplicationUserPermission> permisson)
    {
        this.permisson = permisson;

    }

}
