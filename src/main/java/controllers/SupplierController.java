package controllers;

import entities.Suplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import services.SupplierService;

@RequestMapping("/suplier")
@Controller
public class SupplierController {

    private final SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("/all")
    public String getAll(Model m) {
        m.addAttribute("supplierList", supplierService.getAll());
        return "suplier";
    }

    @GetMapping("/insert")
    public String insert(@ModelAttribute("suplier") Suplier suplier) {
        return "insert";
    }

    @PostMapping("/insert")
    public String insert(@ModelAttribute("suplier") Suplier suplier, BindingResult result) {
        supplierService.insert(suplier);
        return "redirect:/suplier/all";
    }

    @GetMapping("/delete")
    public String delete() {
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int id) {
        supplierService.deleteSuplier(id);
        return "redirect:/suplier/all";
    }

    @GetMapping("/update")
    public String update() {
        return "update";
    }

    @PostMapping("/update")
    public String update(@RequestParam int id,
                         @RequestParam String companyName) {
        supplierService.update(id, companyName);
        return "redirect:/suplier/all";
    }
}

