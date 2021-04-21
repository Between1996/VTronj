package org.tron.tronj.abi.datatypes.generated;

import java.util.List;
import org.tron.tronj.abi.datatypes.StaticArray;
import org.tron.tronj.abi.datatypes.Type;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.tron.tronj.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class StaticArray22<T extends Type> extends StaticArray<T> {
    @Deprecated
    public StaticArray22(List<T> values) {
        super(22, values);
    }

    @Deprecated
    @SafeVarargs
    public StaticArray22(T... values) {
        super(22, values);
    }

    public StaticArray22(Class<T> type, List<T> values) {
        super(type, 22, values);
    }

    @SafeVarargs
    public StaticArray22(Class<T> type, T... values) {
        super(type, 22, values);
    }
}
