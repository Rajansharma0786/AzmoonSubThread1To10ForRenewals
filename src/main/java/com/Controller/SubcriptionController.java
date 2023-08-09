package com.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.TblSubscription;
import com.Repository.TblBillingRepo;
import com.Repository.TblSubscriptionRepository;
import com.Service.SubscriptionService;

//@RestController
@Component
public class SubcriptionController {

	@Autowired
	TblSubscriptionRepository subscriptionRepository;

	@Autowired
	SubscriptionService service;

	@Autowired
	TblBillingRepo billingRepo;

	private final String hour = "3";
	private final String hour1="11";
	private final String hour2="17";
	
	
	@Scheduled(cron = "0 45 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 45 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 45 "+hour2+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread1() {

		try {
			String status="1";
			System.out.println("Control Inside Subscription");
			List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//				System.out.println("value of subscription is"+subscription);
			if (subscription.size() != 0) {
//					System.out.println("Control inside if");
				service.saveRenTypeInBilling(subscription,status);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Exception in Subscription Controller" + e.getMessage());
		}

	}

	@Scheduled(cron = "0 46 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 46 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 46 "+hour2+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread2() {

			try {
				String status="2";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription,status);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	@Scheduled(cron = "0 47 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 47 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 47 "+hour2+" * * *", zone = "Asia/Kolkata")

		public void getTypeRenForThread3() {

			try {
				String status="3";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription,status);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	@Scheduled(cron = "0 48 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 48 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 48 "+hour2+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread4() {

			try {
				String status="4";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription,status);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	@Scheduled(cron = "0 49 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 49 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 49 "+hour2+" * * *", zone = "Asia/Kolkata")

	public void getTypeRenForThread5() {

			try {
				String status="5";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription,status);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	@Scheduled(cron = "0 50 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 50 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 50 "+hour2+" * * *", zone = "Asia/Kolkata")

	public void getTypeRenForThread6() {

			try {
				String status="6";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription,status);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	@Scheduled(cron = "0 51 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 51 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 51 "+hour2+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread7() {

			try {
				String status="7";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription,status);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	@Scheduled(cron = "0 52 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 52 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 52 "+hour2+" * * *", zone = "Asia/Kolkata")

	public void getTypeRenForThread8() {

			try {
				String status="8";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription,status);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	@Scheduled(cron = "0 53 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 53 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 53 "+hour2+" * * *", zone = "Asia/Kolkata")

	public void getTypeRenForThread9() {

			try {
				String status="9";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription,status);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	@Scheduled(cron = "0 54 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 54 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 54 "+hour2+" * * *", zone = "Asia/Kolkata")

	public void getTypeRenForThread10() {

			try {
				String status="10";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription,status);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
}