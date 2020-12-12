package com.saltynote.service.domain.transfer;

import com.saltynote.service.domain.IdentifiableUser;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtUser implements IdentifiableUser {
  private Integer id;
  private String username;
}