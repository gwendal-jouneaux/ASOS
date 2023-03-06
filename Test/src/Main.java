import java.math.BigInteger;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Query;
import org.eclipse.ocl.helper.OCLHelper;

import foo.A;
import foo.FooFactory;
import foo.FooPackage;

public class Main {

	public static void main(String[] args) throws Exception {

		final OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		final OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		
		A a = FooFactory.eINSTANCE.createA();
		a.setAge(BigInteger.TEN);

		final String expession = "age > 200";
		final String expession1 = "age > 2";

		helper.setContext(FooPackage.Literals.A);
		final Constraint constraint = helper.createInvariant(expession);
		final Query constraintEval = ocl.createQuery(constraint);
		System.err.println(constraintEval.check(a));

		final Constraint constraint1 = helper.createInvariant(expession1);
		final Query constraintEval1 = ocl.createQuery(constraint1);
		System.err.println(constraintEval1.check(a));

	}

}
