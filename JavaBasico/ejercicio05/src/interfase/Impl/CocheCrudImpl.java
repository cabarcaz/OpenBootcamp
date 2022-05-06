package interfase.Impl;

import entidades.Coche;

public interface CocheCrudImpl {
  public void save(Coche coche);
  public void findAll();
  public void delete(Coche coche);
}
