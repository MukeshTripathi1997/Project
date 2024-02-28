package in.mukeshit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mukeshit.entity.CitizenPlan;
import in.mukeshit.repo.CitizenPlanRepository;
import in.mukeshit.request.SearchRequest;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private CitizenPlanRepository planRepo;

	@Override
	public List<String> getPlanNames() {
		return planRepo.getPlanNames();
	}

	@Override
	public List<String> getPlanStatuses() {
		return planRepo.getPlanStatuses(); // Corrected method name
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		return planRepo.findAll();

	}

	@Override
	public boolean exportExcel() {
		// Implement export to Excel functionality
		// For now, returning false
		return false;
	}

	@Override
	public boolean exportPdf() {
		// Implement export to PDF functionality
		// For now, returning false
		return false;
	}
}
