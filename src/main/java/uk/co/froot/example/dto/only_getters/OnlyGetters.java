package uk.co.froot.example.dto.only_getters;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * <p>Example DTO to provide the following to resources:</p>
 * <ul>
 * <li>Representation of "only getters" state</li>
 * <li>Example REST endpoint is <code>http://localhost:10000/only-getters</code></li>
 * <li>Example Admin REST endpoint is <code>http://localhost:10001/only-getters/metrics</code></li>
 * <li>See <code>ApplicationPaths.ONLY_GETTERS</code></li>
 * </ul>
 *
 * @since 0.0.1
 */
@JsonRootName("only_getters")
public class OnlyGetters {

  @JsonProperty
  private Long id;

  #getId

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    OnlyGetters user = (OnlyGetters) o;

    if (id != null ? !id.equals(user.id) : user.id != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }
}
