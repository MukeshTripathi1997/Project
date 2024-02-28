package in.mukeshit.service;

import java.util.List;

import in.mukeshit.entity.CitizenPlan;
import in.mukeshit.request.SearchRequest;

public interface ReportService {

	public List<String> getPlanNames();

	public List<String> getPlanStatuses();

	public List<CitizenPlan> search(SearchRequest request);

	public boolean exportExcel();

	public boolean exportPdf();
}
