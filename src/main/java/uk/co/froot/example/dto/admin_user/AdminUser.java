package uk.co.froot.example.dto.admin_user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * <p>Example DTO to provide the following to resources:</p>
 * <ul>
 * <li>Representation of "admin user" state</li>
 * <li>Example REST endpoint is <code>http://localhost:10000/admin-user</code></li>
 * <li>Example Admin REST endpoint is <code>http://localhost:10001/admin-user/metrics</code></li>
 * <li>See <code>ApplicationPaths.ADMIN_USER</code></li>
 * </ul>
 *
 * @since 0.0.1
 */
@JsonRootName("admin_user")
public class AdminUser {

  @JsonProperty
  private Long id;

  #getId

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    AdminUser user = (AdminUser) o;

    if (id != null ? !id.equals(user.id) : user.id != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }
}
