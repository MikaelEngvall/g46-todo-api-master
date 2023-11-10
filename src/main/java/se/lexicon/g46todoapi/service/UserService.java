package se.lexicon.g46todoapi.service;

import se.lexicon.g46todoapi.domain.dto.UserDTOForm;
import se.lexicon.g46todoapi.domain.dto.UserDTOView;

import java.util.List;

public interface UserService {
  UserDTOView register(UserDTOForm userDTOForm);
  List<UserDTOView> getAll();

  UserDTOView getByEmail(String email);

  void disableByEmail(String email);

  void enableByEmail(String email);


}
