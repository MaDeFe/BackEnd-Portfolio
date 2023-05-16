
package com.portfolio.mpm.Controller;

import com.portfolio.mpm.Service.CvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cv")
public class CvController {
    
 /*   @Autowired
    private CvService cvServ;
    
    @GetMapping ("/all")
    @ResponseBody
    public List seeCv () {
        return cvServ.getCv();
    }
    
    @PostMapping ("/add")
    public void addCv (@RequestBody Cv cv) {
        cvServ.saveCv(cv);
    }
    
    @PutMapping("/edit/{cv_id}")
    public Cv updateCv (@RequestBody Cv cv, @PathVariable Long cv_id) {
        return cvServ.updateCv(cv, cv_id);
    }
    
    @DeleteMapping ("/delete/{cv_id}")
    public void deleteCv (@PathVariable("cv_id") Long cv_id) {
        cvServ.deleteCv(cv_id);
    }
    */
}
