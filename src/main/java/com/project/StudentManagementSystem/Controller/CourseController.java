package com.project.StudentManagementSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.StudentManagementSystem.entity.Course;
import com.project.StudentManagementSystem.service.CourseService;

@Controller
public class CourseController {

	private CourseService courseService;

	public CourseController(CourseService courseService) {
		super();
		this.courseService = courseService;
	}
	
	//handling method to handle list courses
	@GetMapping("/courses")
	public String listCourses(Model model) {
		model.addAttribute("courses",courseService.getAllCourses());
		return "courses";
	}
	
	@GetMapping("/courses/new")
	public String createCourseForm(Model model) {
		//creating course obj to hold course data
		Course course = new Course();
		model.addAttribute("course", course);
		return "create_course";
	}
	
	@PostMapping("/courses")
	public String saveCourse(@ModelAttribute("course") Course course, RedirectAttributes redirectAttributes) {
		courseService.saveCourse(course);
        redirectAttributes.addFlashAttribute("successMessage", "Course created successfully");
		return "redirect:/courses";
	}
	
	@GetMapping("/courses/edit/{courseid}")
	public String editCourseForm(@PathVariable Long courseid, Model model) {
		model.addAttribute("course", courseService.getCourseById(courseid));
		return "edit_course";
	}
	
	
	@PostMapping("/courses/{courseid}")
	public String updateCourse(@PathVariable Long id, @ModelAttribute("course") Course course, Model model, RedirectAttributes redirectAttributes) {
		Course existingCourse = courseService.getCourseById(id);
		existingCourse.setId(course.getId());
		existingCourse.setCoursename(course.getCoursename());
		existingCourse.setDuration(course.getDuration());
		existingCourse.setInstructorname(course.getInstructorname());
		existingCourse.setMaxseats(course.getMaxseats());
		courseService.updateCourse(existingCourse);
		existingCourse = courseService.updateCourse(course);
		redirectAttributes.addFlashAttribute("successMessage", "Course updated successfully");
		return "redirect:/courses";

	}
	@GetMapping("/courses/{id}")
	public String deleteCourse(@PathVariable Long id, RedirectAttributes redirectAttributes) {
		courseService.deleteCourseById(id);
        redirectAttributes.addFlashAttribute("successMessage", "Course deleted successfully");
		return "redirect:/courses";
	}
}
