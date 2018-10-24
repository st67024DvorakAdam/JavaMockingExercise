package cz.upce.fei.inptp.databasedependency.entity;

import java.util.List;

/**
 * PersonRole entity (mapping of person's roles)
 */
public class PersonRole {
    
    private Person person;
    private List<Role> roles;

    public PersonRole() {
    }

    public PersonRole(Person person, List<Role> roles) {
        this.person = person;
        this.roles = roles;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "PersonRoles{" + "person=" + person + ", roles=" + roles + '}';
    }
}
