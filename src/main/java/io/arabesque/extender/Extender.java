package io.arabesque.extender;

import com.koloboke.collect.IntCollection;

import io.arabesque.computation.Computation;
import io.arabesque.embedding.Embedding;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Externalizable;
import java.io.Serializable;

abstract class Extender implements Externalizable {
   
   public abstract IntCollection extend(Embedding e, Computation c);
   
}