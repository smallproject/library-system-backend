package nl.smallproject.www.librarysystembackend.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoleModelTest {
    @Test
    void testConstructorWithId() {
        Long id = 1L;
        RoleModel roleModel = new RoleModel(id);

        assertNotNull(roleModel, "RoleModel should not be null after creation.");
        assertEquals(id, roleModel.getId(), "The ID should be correctly set by the constructor.");
        assertNull(roleModel.getRoleName(), "RoleName should be null when only ID is provided.");
        assertFalse(roleModel.isActive(), "Active should default to false.");
        assertNull(roleModel.getDescription(), "Description should be null by default.");
    }

    @Test
    void testConstructorWithRoleName() {
        String roleName = "Admin";
        RoleModel roleModel = new RoleModel(roleName);

        assertNotNull(roleModel, "RoleModel should not be null after creation.");
        assertEquals(-1L, roleModel.getId(), "The ID should be set to -1 by the roleName constructor.");
        assertEquals(roleName, roleModel.getRoleName(), "The roleName should be correctly set by the constructor.");
        assertFalse(roleModel.isActive(), "Active should default to false.");
        assertNull(roleModel.getDescription(), "Description should be null by default.");
    }

    @Test
    void testSetAndGetRoleName() {
        RoleModel roleModel = new RoleModel(1L);
        String roleName = "User";

        roleModel.setRoleName(roleName);

        assertEquals(roleName, roleModel.getRoleName(), "The roleName should match the value set by setRoleName.");
    }

    @Test
    void testSetAndGetActive() {
        RoleModel roleModel = new RoleModel(1L);

        roleModel.setActive(true);
        assertTrue(roleModel.isActive(), "Active should be true after setting it to true.");

        roleModel.setActive(false);
        assertFalse(roleModel.isActive(), "Active should be false after setting it to false.");
    }

    @Test
    void testSetAndGetDescription() {
        RoleModel roleModel = new RoleModel(1L);
        String description = "This is a test role.";

        roleModel.setDescription(description);

        assertEquals(description, roleModel.getDescription(), "The description should match the value set by setDescription.");
    }
}
