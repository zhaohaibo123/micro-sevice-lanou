package meng.xing.service;

import meng.xing.entity.Subject;
import meng.xing.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultSubject implements SubjectService {
    private final
    SubjectRepository subjectRepository;

    @Autowired
    public DefaultSubject(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public List<Subject> findAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject findSubjectByType(String type) {
        return subjectRepository.findByType(type);
    }
}
