package org.formacio.setmana1.data;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class LlibreNoExisteixException extends Exception { }
