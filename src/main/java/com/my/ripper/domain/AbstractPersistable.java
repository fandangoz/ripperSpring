package com.my.ripper.domain;
 
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import org.springframework.data.domain.Persistable;
 
@MappedSuperclass
public abstract class AbstractPersistable<PK extends Serializable> implements Persistable<PK> {
  private static final long serialVersionUID = -5554308939380869754L;
 
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private PK id;
 
  public PK getId() {
    return id;
  }
 
  protected void setId(final PK id) {
    this.id = id;
  }
 
  public boolean isNew() {
    return null == getId();
  }
 
  @Override
  public String toString() {
    return String.format("Entity of type %s with id: %s", this.getClass().getName(), getId());
  }
 
  @Override
  public boolean equals(Object obj) {
    if (null == obj) {
      return false;
    }
    if (this == obj) {
      return true;
    }
    if (!getClass().equals(obj.getClass())) {
      return false;
    }
 
    AbstractPersistable<?> that = (AbstractPersistable<?>) obj;
    return null == this.getId() ? false : this.getId().equals(that.getId());
  }
 
  @Override
  public int hashCode() {
    int hashCode = 17;
    hashCode += null == getId() ? 0 : getId().hashCode() * 31;
    return hashCode;
  }
}