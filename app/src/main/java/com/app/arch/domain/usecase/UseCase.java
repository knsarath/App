package com.app.arch.domain.usecase;

import androidx.annotation.NonNull;

public abstract class UseCase<REQUEST, RESULT> {

    final public RESULT execute(UseCaseInput<REQUEST> useCaseInput) {
        return onExecute(useCaseInput);
    }

    abstract @NonNull RESULT onExecute(UseCaseInput<REQUEST> useCaseInput);


}
