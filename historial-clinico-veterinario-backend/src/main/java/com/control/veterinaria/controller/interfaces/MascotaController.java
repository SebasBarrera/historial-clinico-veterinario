package com.control.veterinaria.controller.interfaces;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.control.veterinaria.model.Mascota;

public interface MascotaController {
	public String add(Model model);
	public String delete(@PathVariable("id") Integer id, Model model);
	public String index(Model model);
	public String save(Mascota mascota, BindingResult bindingResult, Model model, @RequestParam(value = "action", required = true) String action);
	public String show(@PathVariable("id") Integer id, Model model);
	public String update(@PathVariable("id") Integer id, @RequestParam(value = "action", required = true) String action, @ModelAttribute Mascota mascota, BindingResult b, Model model);
	public String info(Integer businessentityid, Model model);
}
