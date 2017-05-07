package cl.tcgplanet.persistence;

import java.util.List;

import cl.tcgplanet.domain.CodeName;

public interface CustomerStatusMapper {
    public List<CodeName> getAllStatus();
}
