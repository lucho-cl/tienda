package cl.tcgplanet.service;

import java.util.List;

import cl.tcgplanet.domain.CodeName;

public interface CustomerStatusService {
    public List<CodeName> getAllStatus();
}
