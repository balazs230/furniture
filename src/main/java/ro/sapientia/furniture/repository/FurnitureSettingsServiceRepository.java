package ro.sapientia.furniture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ro.sapientia.furniture.model.SettingsServiceBody;

public interface FurnitureSettingsServiceRepository extends JpaRepository<SettingsServiceBody, Long>{
	//SettingsService
	SettingsServiceBody findSettingsServiceBodyById(Long id);
	
}