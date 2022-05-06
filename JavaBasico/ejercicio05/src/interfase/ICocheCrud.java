package interfase;

import java.util.ArrayList;
import java.util.List;

import entidades.Coche;
import interfase.Impl.CocheCrudImpl;

public class ICocheCrud implements CocheCrudImpl{

  @Override
  public void save(Coche coche) {
   List<String> listaCoche = new ArrayList<String>();
    listaCoche.add(coche);

  }

  @Override
  public void findAll() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void delete(Coche coche) {
    // TODO Auto-generated method stub
    
  }
  
}
